package guru.springframework.sfgpetclinic.model;

public class PetType extends BaseEntity{
    public static final long serialVersionUID = 1L;
    private String getName;

    public String getGetName() {
        return getName;
    }

    public void setGetName(String getName) {
        this.getName = getName;
    }

    
}
