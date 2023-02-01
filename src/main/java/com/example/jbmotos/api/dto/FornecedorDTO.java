package com.example.jbmotos.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FornecedorDTO {

    @NotBlank(message = "O campo CNPJ é obrigatório")
    @CNPJ
    private String cnpj;

    @NotBlank(message = "O campo Nome é obrigatório")
    @Length(min = 3, max = 50, message = "O campo Nome deve ter entre 3 e 50 caracteres.")
    private String nome;

    @NotBlank(message = "O campo Telefone é obrigatório")
    @Length(min =11, max = 15, message = "O campo Telefone deve ter entre 11 e 15 caracteres.")
    private String telefone;
}
