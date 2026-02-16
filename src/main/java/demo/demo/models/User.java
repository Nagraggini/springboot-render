package demo.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//A models mappában lévő java fájlokkal kezeljük a felhasználókat.(vagy objektumokat,szolgáltatásokat)
//Az annotációk megmondja, hogy van egy ilyen táblánk az adatbázisban.
@Entity
@Table(name = "users")
public class User {

    // Ezek az elsődleges kulcs létrehozásához kellenek. A users adattáblában van
    // egy uid oszlopunk.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Lefogja generálni az értékét.
    private int uid;

    // Változók:
    private String name;
    private String nickname;
    private String color;

    // Jobb klikk itt Source Actions -> Generate Constructor
    // konstruktorok
    public User() {
    }

    public User(String name, String nickname, String color) {
        this.name = name;
        this.nickname = nickname;
        this.color = color;
    }

    // getter/setterek
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Jobb klikk itt Source Actions -> Generate Constructor
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

}
