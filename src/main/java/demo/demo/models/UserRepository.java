package demo.demo.models;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//Automatikusan létrehoz neked egy komplett adatbázis-kezelő réteget a User entitáshoz — anélkül, hogy SQL-t kellene írni.
//JpaRepository<EntitásTípus, PrimaryKeyTípus>
public interface UserRepository extends JpaRepository<User, Integer> {
    // Listákba lementjük az adatokat az adatbázisból.
    // A változók az User.java fájlból vannak. A findBy részre figyelj, nagy betűvel
    // kezd az utána lévő részt.
    List<User> findByColor(String color);

    List<User> findByNameAndNickname(String name, String nickname);
}
