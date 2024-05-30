/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cau2;

import java.sql.*;
/**
 *
 * @author ThisorQ
 */
public class ketnoi {
     public static Connection KNCSDL() throws SQLException
    {
       //Thực hiện kết nối với cơ sở dữ liệu
       Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/QLphuongtien","root", "");
       return c;
    } 
}
