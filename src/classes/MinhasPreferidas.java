package classes;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 8){
            System.out.println(audio.getTitulo() + " é considerado um sucesso e preferido");
        }else{
            System.out.println(audio.getTitulo() + " esta bombando");
        }
    }

}
