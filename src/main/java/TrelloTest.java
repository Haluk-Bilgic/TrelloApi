import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
public class TrelloTest {


    public String key="811cea0d736a2dd99f92a7ab8cdb4153";
    public String token="365f48a3e5aa79654e06b4ecfa974317bec86d1f9445ceb69b8bdb90f4e31b64";


    @Test
    public  void Requests1(){
        RestAssured.baseURI ="https://api.trello.com";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("name", "newBoard");
        requestParams.put("key",key);

        requestParams.put("token",token);

        request.header("Content-Type", "application/json");

        request.body(requestParams.toJSONString());

        request.post("1/boards");
        request.log().body();
    }
    @Test
    public void Requests2(){
        RestAssured.baseURI ="https://api.trello.com";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("name", "newList");
        requestParams.put("idBoard","5a27e722e2f04f3ab6924931");
        requestParams.put("key",key);
        requestParams.put("token",token);

        request.header("Content-Type", "application/json");

        request.body(requestParams.toJSONString());

        request.post("1/lists");

    }
    @Test
    public  void Requests3(){
        RestAssured.baseURI ="https://api.trello.com";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("name", "newCard");
        requestParams.put("idList","5a27e3b62fef5d3a74dca48a");
        requestParams.put("key",key);
        requestParams.put("token",token);

        request.header("Content-Type", "application/json");

        request.body(requestParams.toJSONString());

        request.post("1/cards");
    }
    @Test
    public  void Requests4(){
        RestAssured.baseURI ="https://api.trello.com";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();

        requestParams.put("idCard","f5d3a74dca48a5a27e3b62fe");
        requestParams.put("key","811cea0d736a2dd99f92a7ab8cdb4153");
        requestParams.put("token","365f48a3e5aa79654e06b4ecfa974317bec86d1f9445ceb69b8bdb90f4e31b64");

        request.header("Content-Type", "application/json");

        request.body(requestParams.toJSONString());

        request.put("1/cards");
    }
    @Test
    public  void Requests5(){
        RestAssured.baseURI ="https://api.trello.com";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();

        requestParams.put("idCard","f5d3a74dca48a5a27e3b62fe");
        requestParams.put("key","811cea0d736a2dd99f92a7ab8cdb4153");
        requestParams.put("token","365f48a3e5aa79654e06b4ecfa974317bec86d1f9445ceb69b8bdb90f4e31b64");

        request.header("Content-Type", "application/json");

        request.body(requestParams.toJSONString());

        request.delete("1/cards");
    }
    @Test
    public  void Requests6(){
        RestAssured.baseURI ="https://api.trello.com";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();

        requestParams.put("idBoard","5a27e722e2f04f3ab6924931");
        requestParams.put("key","811cea0d736a2dd99f92a7ab8cdb4153");
        requestParams.put("token","365f48a3e5aa79654e06b4ecfa974317bec86d1f9445ceb69b8bdb90f4e31b64");

        request.header("Content-Type", "application/json");

        request.body(requestParams.toJSONString());

        request.delete("1/boards");
    }
}
