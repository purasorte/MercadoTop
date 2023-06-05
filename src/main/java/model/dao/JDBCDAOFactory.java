/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

/**
 *
 * @author luizj
 */
public class JDBCDAOFactory extends DAOFactory{
    
    public ProdutosDAO getProdutosDAO() {
        return new ProdutoDAO();
    }
}
