/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.List;
import model.bean.Produto;

/**
 *
 * @author luizj
 */
public interface ProdutosDAO {
    
    public void create(Produto p);
    public List<Produto> read();
    public List<Produto> readForDesc(String desc);
    public void update(Produto p);
    public void delete(Produto p);
}
