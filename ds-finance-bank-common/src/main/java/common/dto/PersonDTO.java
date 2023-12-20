package common.dto;

import java.io.Serializable;

public class PersonDTO implements Serializable {


    protected int svnr;
    protected String name;
    protected String givenname;
    protected String username;
    protected String addresse;

    public PersonDTO() {
    }

    public PersonDTO(int svnr, String name, String givenname, String username, String addresse) {
        this.svnr = svnr;
        this.name = name;
        this.givenname = givenname;
        this.username = username;
        this.addresse = addresse;
    }

    public PersonDTO(int svnr) {
        this.svnr = svnr;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public int getSvnr() {
        return svnr;
    }

    public String getName() {
        return name;
    }

    public String getGivenname() {
        return givenname;
    }

    public String getUsername() {
        return username;
    }

    public void setSvnr(int svnr) {
        this.svnr = svnr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGivenname(String givenname) {
        this.givenname = givenname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "svnr=" + svnr +
                ", name='" + name + '\'' +
                ", givenname='" + givenname + '\'' +
                ", username='" + username + '\'' +
                ", addresse='" + addresse + '\'' +
                '}';
    }
}
