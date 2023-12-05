package model;

public class Aut {
    private int idUser;
    private String name;
    private int age;
    private String img;

    public Aut(int idUser, String name, int age, String img) {
        this.idUser = idUser;
        this.name = name;
        this.age = age;
        this.img = img;
    }

    public Aut() {
    }

    public Aut(String name, int age, String img) {
        this.name = name;
        this.age = age;
        this.img = img;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
