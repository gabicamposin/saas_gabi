package apllication.models;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name = "autores")
public class Autor{

    private int id;
    private string nome;

    public void setNome(String nome){
        this.nome = nome;
    }

    public string getNome(){
        return nome;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    

}
