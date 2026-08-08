import org.json.JSONObject;

public class JAVAP6S093JsonEncodingDecodingApp {

    static class Person {

        String name;
        int age;
        String email;

        Person(String name, int age, String email) {
            this.name = name;
            this.age = age;
            this.email = email;
        }
    }

    public static void main(String[] args) {

        Person person = new Person(
                "Mahiran",
                20,
                "mahiran@gmail.com"
        );

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("name", person.name);
        jsonObject.put("age", person.age);
        jsonObject.put("email", person.email);

        System.out.println("===== ENCODED JSON =====");
        System.out.println(jsonObject.toString(2));

        String jsonString = jsonObject.toString();

        JSONObject parsedObject = new JSONObject(jsonString);

        String name = parsedObject.getString("name");
        int age = parsedObject.getInt("age");
        String email = parsedObject.getString("email");

        Person decodedPerson = new Person(name, age, email);

        System.out.println();
        System.out.println("===== DECODED PERSON OBJECT =====");
        System.out.println("Name  : " + decodedPerson.name);
        System.out.println("Age   : " + decodedPerson.age);
        System.out.println("Email : " + decodedPerson.email);
    }
}