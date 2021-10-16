public class Quest1_Paciente {

    private int codigo;
    private String nome, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo;

   public Quest1_Paciente(String nome, int cod, String dataNascimento, String sexo, String alergia, String saude, String tipoSanguineo){

       this.codigo = cod;
        this.planoSaude = saude;
        this.alergia = alergia;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.tipoSanguineo = tipoSanguineo;
        this.sexo = sexo;

    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public String getNome (){
        return this.nome;
    }

    public void setDataNascimento (String data) {
        this.dataNascimento = data;
    }
    public String getDataNascimento (){
        return this.dataNascimento;
    }

    public void setSexo (String sexo) {
        this.sexo = sexo;
    }
    public String getSexo (){
        return this.sexo;
    }

    public void setPlanoSaude(String qual){
        this.planoSaude = qual;
    }
    public String getPlanoSaude (){
        return this.planoSaude;
    }

    public void setAlergia (String alergia) {
        this.alergia = alergia;
    }
    public String getAlergia (){
        return this.alergia;
    }

    public void setTipoSanguineo (String sangue) {
        this.tipoSanguineo = sangue;
    }
    public String getTipoSanguineo (){
        return this.tipoSanguineo;
    }

    public void setCodigo(int c){
        this.codigo = c;
    }
    public int getCodigo(){
        return this.codigo;
    }
}
