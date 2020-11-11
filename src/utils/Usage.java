/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author lamit
 */
public interface Usage {
    public int port = 4567;
    public String serverHost = "localhost";
    
    public String findAccount = "select * from tblaccount where _username = ? and _password = ?";
    public String register = "insert into tblaccount(_username,_password) values(?,?)";
    public String insertUser = "insert into tbluser(_accid,_point_status) values (?,?,?)";
    public String insertAccount = "insert into tblaccount(_username,_password) values(?,?)";
    public String insertGame = "insert into tblGame(_timecreate) values(?)";
    public String insertChoice = "insert into tblChoice(_userid,_gameid,choice) values(?,?,?)";
    public String insertChoiceResult = "update tblChoice set result = ? where id = ?";
    public String getAllUser = "select u._point,u._status,a._username from tbluser as u, tblaccount as a "
            + "where u._accid = a.id";
}