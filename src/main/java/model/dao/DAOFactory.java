/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;
/*
@author luizj
*/
public abstract class DAOFactory {
    public abstract ProdutosDAO getProdutosDAO();
}
/*A interface ProdutosDAO define as operações de CRUD que serão realizadas. 
A classe ProdutoDAO implementa a interface ProdutosDAO e representa o objeto que será criado pelo Factory Method. 
A classe abstrata DAOFactory define o método factoryMethod() que será implementado pelas classes JDBCDAOFactory e 
HibernateDAOFactory, que são as ConcreteDAOFactories.

A classe JDBCDAOFactory retorna um objeto do tipo ProdutoDAO, 
enquanto a classe HibernateDAOFactory retorna um objeto do tipo ProdutoDAO. 
Essas duas classes são exemplos de ConcreteDAOFactories, 
que são implementações específicas da interface DAOFactory. 
A interface DAOFactory deve ser definida de forma genérica para 
permitir que diferentes tipos de implementações sejam criadas 
stackoverflow.com....
No exemplo acima, o método getInstance é usado para criar uma instância de DAOFactory com base no tipo de DAO fornecido. 
Isso permite que diferentes implementações sejam criadas de acordo com a necessidade.
Ao implementar a interface DAOFactory, você deve definir um método factoryMethod() 
que criará uma instância do objeto ProdutoDAO. 
As classes JDBCDAOFactory e HibernateDAOFactory são exemplos de ConcreteDAOFactories que implementam esse método.
Ambas as classes estendem a interface DAOFactory e sobrescrevem o método getProdutosDAO(), 
retornando uma instância do tipo ProdutoDAO.

Para utilizar o Factory Method, o cliente deve chamar o método getInstance() 
com o tipo de DAO desejado e usar o objeto retornado para criar e 
manipular instâncias de ProdutoDAO.
Neste exemplo, o objeto produtosDAO é uma instância de ProdutoDAO, criada pela classe JDBCDAOFactory ou 
HibernateDAOFactory, dependendo da implementação específica escolhida stackoverflow.com.*/