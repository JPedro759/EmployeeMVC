package br.fatecrl.Employee.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/*Obs.: Estou utilizando uma extensão do vscode chamada Lombok, que é uma ferramenta que auxilia no desenvolvimento de aplicações Java, oferece recursos para 
    reduzir a verbosidade do código e automatiza tarefas comuns para melhorar a produtividade.
 * 
 *  O Lombok permite a anotação de campos em classes Java, como @Getter, @Setter e @AllArgsConstructor.
 * 
 *  @Getter e @Setter => gerar automaticamente os métodos getters e setters;
 *  @AllArgsConstructor => gerar automaticamente o construtor com os parâmetros para cada campo da classe e atribui os valores aos campos correspondentes.
*/
@AllArgsConstructor
@Setter
@Getter
public class Employee {
    private Integer _id;
    private String _name;
    private String _office;
    private String _department;
    private Double _salary;
}
