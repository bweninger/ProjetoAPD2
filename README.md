ProjetoAPD2
===========

Projeto da matéria de APD2 do Mackenzie 02/2014

Estrutura do projeto:
Menus usam o padrão Composite, sendo Opcao o Component, Menu o Composite e Acao o Leaf.
Usa-se fabricas abstratar para criar as classes do modelo, sendo elas também Singleton.
Para criar uma classe do modelo, crie uma fábrica herdando a AbstractEntityFactory<T> e parametrizando o tipo T da classe e sobrescreva o construtor padrão chamando super(Class<T> clazz) com a classe do modelo como parâmetro.
Também usa de polimorfismo para as classes Reserva, ReservaQuarto e Passagem Aérea


