package Model.Data;

/**
 * Created by MACHINE on 07/02/2016.
 */
public class User {

    public  int UserId;
    public  String Tel;
    public  String UserName;

    public  User()
    {

    }

    public User(int userId, String tel, String userName) {
        UserId = userId;
        Tel = tel;
        UserName = userName;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public static String SQL_CREATE_USER=
            "CREATE TABLE User (\n" +
                    "    UserId INT          PRIMARY KEY\n" +
                    "                         UNIQUE\n" +
                    "                         NOT NULL,\n" +
                    "    Tel     VARCHAR (50) UNIQUE\n" +
                    "                         NOT NULL,\n" +
                    "    UserName    VARCHAR (50) NOT NULL\n" +
                    ");\n";

    public static final String SQL_DELETE_USER =
            "DROP TABLE IF EXISTS User ";
}
