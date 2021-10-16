public class Quest1_ClinicaPaciente {

    public static void main(String[] args){

        System.out.println(" ");
        Quest1_Paciente paciente = new Quest1_Paciente("Gustavo", 2, "12/08/2004", "Masculino", "Nenhuma", "Nenhum", "AB+");
        System.out.println("Codigo: "+paciente.getCodigo());
        System.out.println("Nome: "+ paciente.getNome());
        System.out.println("Data de Nascimento: "+ paciente.getDataNascimento());
        System.out.println("Sexo: "+ paciente.getSexo());
        System.out.println("Plano de saude: "+ paciente.getPlanoSaude());
        System.out.println("Alergia: "+ paciente.getAlergia());
        System.out.println("Tipo Sanguíneo: "+ paciente.getTipoSanguineo());

        paciente.setNome("Anna Thercia");
        paciente.setDataNascimento("04/01/1978");
        paciente.setSexo("Feminino");
        paciente.setAlergia("Pólem");
        paciente.setPlanoSaude("Barata");
        paciente.setTipoSanguineo("AB-");
        paciente.setCodigo(3);
        System.out.println(" ");
        System.out.println("Codigo: "+paciente.getCodigo());
        System.out.println("Nome: "+ paciente.getNome());
        System.out.println("Data de Nascimento: "+ paciente.getDataNascimento());
        System.out.println("Sexo: "+ paciente.getSexo());
        System.out.println("Plano de saude: "+ paciente.getPlanoSaude());
        System.out.println("Alergia: "+ paciente.getAlergia());
        System.out.println("Tipo Sanguíneo: "+ paciente.getTipoSanguineo());
    }
}
