http://private-anon-a67977344c-apifaketory.apiary-mock.com/api/user?limit=1

https://www.udemy.com/course/spring-framework-5-beginner-to-guru/learn/lecture/8077000
https://www.baeldung.com/jackson-annotations
https://www.baeldung.com/jackson-advanced-annotations

@JsonRootName(value = "user", namespace="users")
public class UserWithRootNamespace {
    public int id;
    public String name; }
    
{
    "user":{
        "id":1,
        "name":"John"
    }
}

https://apifaketory.docs.apiary.io/#