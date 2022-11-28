Pessoa pessoa = new Pessoa ();
Pessoa aluno = new aluno ();
Pessoa professor = new Professor();

pessoa.setEndereco("rua1, num1");
aluno.setEndereco("rua2, num2");
professor.setEndereco("Rua3, num3");

System.out.println(pessoa.obterEtiquetaEndereco());
System.out.println(aluno.obterEtiquetaEndereco());
System.out.println(professor.obterEtiquetaEndereco());
