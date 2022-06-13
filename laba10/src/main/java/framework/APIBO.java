package framework;

import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;
import framework.APIRequests;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import static io.restassured.RestAssured.given;

public class APIBO {

    private static APIRequests apiRequests = new APIRequests();
    private static Integer listSize = 0;

    @Step
    public Integer apiGet(String url){
        Response response =  apiRequests.getMethod(url);
        return response.getStatusCode();
    }

    @Step
    public Integer getLength(String url){
        Response response =  apiRequests.getMethod(url);
        JsonPath jsnPath = response.jsonPath();
        ArrayList arrayList = jsnPath.get();
        return arrayList.size();
    }


    @Step
    public void checkEqual(Integer expected, Integer actual) {
        Assert.assertEquals(expected,actual);
    }

    @Step
    public void apiAdd(String newUser){
        apiRequests.postMethod(newUser);
    }

    @Step
    public void deleteUser(Integer id){
        apiRequests.deleteMethod(id);
    }

    @Step
    public void  updateUser(String info, Integer id){
        apiRequests.updateMethod(info, id);
    }


}