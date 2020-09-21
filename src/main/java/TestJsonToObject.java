import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vcii.demo.User;
import com.vcii.demo.UserModel;
import org.springframework.beans.BeanUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestJsonToObject {
    public static void main(String[] args) throws ParseException {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        Gson gson = gsonBuilder.create();
        Gson gson = new Gson();
        User user = new User();
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse("17/09/2020");
        user.setId(1);
        user.setName("badat");
        user.setPassword("badat96");
        user.setUsername("dsad");
        user.setCreateDate(date);
        String json = gson.toJson(user);
        System.out.println(json);

        User user1 = gson.fromJson(json, User.class);
        System.out.println(user1.getCreateDate());
        System.out.println(user1);

    }
}
