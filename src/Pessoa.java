import java.time.LocalDate;

/**
 * @author VBraga
 *
 * Classe para exercicio EBAC módulo 7
 *
 */

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private String telefone;
    private String email;

    /**
     * Construtor para criar uma nova pessoa.
     *
     * @param nome O nome da pessoa.
     * @param dataNascimento A data de nascimento da pessoa.
     * @param telefone O telefone da pessoa.
     * @param email O e-mail da pessoa.
     */
    public Pessoa(String nome, LocalDate dataNascimento, String telefone, String email) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
    }

    /**
     * Obtém o nome da pessoa.
     *
     * @return O nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa.
     *
     * @param nome O nome da pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a data de nascimento da pessoa.
     *
     * @return a data de nascimento da pessoa.
     */
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Define a data de nascimento da pessoa.
     *
     * @param dataNascimento a data de nascimento da pessoa.
     */
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * Obtém o telefone da pessoa.
     *
     * @return O telefone da pessoa.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone da pessoa.
     *
     * @param telefone O telefone da pessoa.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Obtém o e-mail da pessoa.
     *
     * @return O e-mail da pessoa.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o e-mail da pessoa.
     *
     * @param email O e-mail da pessoa.
     */
    public void setEmail(String email) {
        this.email = email;
    }
}