package beans;
public class Paciente {
    private String nome;
    private float peso;
    private float altura;
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public float getPeso(){
        return peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public float getIMC(){
        return peso / (altura * altura);
    }
    public String getStatusIMC(){
        String status;
        float imc = getIMC();
        if(imc < 18.5){
            status = "Você está abaixo do peso ideal!";
        }else if(imc >= 18.5 & imc <= 24.9){
            status = "Parabens - Você está em seu peso ideal!";
        }else if(imc >= 25.0 & imc <= 29.9){
            status = "Você está acima do seu peso ideal!";
        }else if(imc >= 30.0 & imc <= 34.9){
            status = "Obsedidade Grau I";
        }else if(imc >= 35 & imc <= 39.9){
            status = "Obsidade Grau II";
        }else{
            status = "Obsidade Grau III (morbida)";
        }
        return status;
    }
}
