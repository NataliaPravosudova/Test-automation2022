package framework;

import lab13.CustomSuiteListener;
import lab13.CustomTestListener;
import lab14.AllureTestListener;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import framework.APIBO;


    @Listeners({
            CustomTestListener.class,
            CustomSuiteListener.class,
            AllureTestListener.class
    })
    public class APITest {

        APIBO apiBO = new APIBO();

        @Test
        void checkStatusCode(){
            //Step 1 get all users
            Integer statusCode = apiBO.apiGet("http://localhost:8000/users");
            //Step 2 check status code
            apiBO.checkEqual(200, statusCode);
        }

        @Test
        void addUser(){
            //Step 1 get current length of array
            Integer length = apiBO.getLength("http://localhost:8000/users");
            //Step 2 add user
            apiBO.apiAdd("{\"name\": \"Natalia\", \"job\": \"Dev\", \"age\": \"20\", \"status\": \"jun\"}");
            //Step 3 get updated length
            Integer newLength = apiBO.getLength("http://localhost:8000/users");
            //Step 4 check 2 lengths
            apiBO.checkEqual(length+1, newLength);
        }

        @Test
        void checkUserExists(){
            //Step 1 get 1 user
            Integer getUser = apiBO.apiGet("http://localhost:8000/users/1");
            //Step 2 check status code
            apiBO.checkEqual(200, getUser);
        }

        @Test
        void checkUpdateUser(){
            //Step 1 Updating info
            apiBO.updateUser("{\"name\": \"Ihor\"}", 2);
            //Step 2 get all users
            Integer statusCode = apiBO.apiGet("http://localhost:8000/users/2");
            //Step 3 check status code
            apiBO.checkEqual(200, statusCode);

        }

        @Test
        void deleteUser(){
            //Step 1 get current size
            Integer length = apiBO.getLength("http://localhost:8000/users");
            //Step 2 delete User
            apiBO.deleteUser(2);
            //Step 3 get new size
            Integer newLength = apiBO.getLength("http://localhost:8000/users");
            //Step 4 compare sizes
            apiBO.checkEqual(length-1, newLength);
        }


        @DataProvider()
        public static Object[][] UpdateData() {
            return new Object[][]{
                    {"name", "NEW_NAME_3", 3},
                    {"job", "NEW_JOB_12", 12},
                    {"age", "NEW_AGE_6", 6},
            };
        }
        @Test(dataProvider = "UpdateData")
        void updateEmployeesTest(String key, String new_value, Integer id){
            //Step 1 Updating info
            apiBO.updateUser("{\""+key+"\": \""+new_value+"\"}", id);
            //Step 2 getting new info
            String updated = apiBO.getKey(key, apiBO.getOneUser(id));
            //Step 3 checking new info
            Assert.assertEquals(updated, new_value);
        }
    }


