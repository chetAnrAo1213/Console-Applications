package com.Jdbc.App;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.hibernate.internal.build.AllowSysOut;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared;

public class ItemDAO implements DmlMethods{

	@Override
	public int insertItem(ItemPOJO ip) 
	{
		int x = 0;
		try
		{
			Connection con = DBProps.getConnection();
			String insertQry="insert into items values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(insertQry);
				ps.setInt(1,ip.getItemID());
				ps.setString(2, ip.getItemName());
				ps.setInt(3,ip.getItemPrice());
				ps.setString(4,ip.getItemType());
				ps.setString(5,ip.getQuantity());
			  x=ps.executeUpdate();
			  System.out.println("Insertion Method Invoked!!");
			  con.close();
		}
		catch(Exception e)
		{
			System.err.println("Method Failed :- "+e.getMessage());
		}
		
		return x;
	}

	@Override
	public int deleteItem(ItemPOJO ip) 
	{
		int x=0;
		try
		{
			Connection con = DBProps.getConnection();
			String deleteQry = "delete from items where id=?";
			PreparedStatement ps = con.prepareStatement(deleteQry);
				ps.setInt(1,ip.getItemID());
			  x=ps.executeUpdate();
			  System.out.println("Deletion Method Invoked!!");
			  con.close();
		}
		catch(Exception e)
		{
			System.err.println("Method Failed :- "+e.getMessage());
		}
		return x;
	}

	@Override
	public int updateItem(ItemPOJO ip) 
	{
		int x = 0;
		try
		{
			Connection con = DBProps.getConnection();
			String updateQry="update items set id=? , set name=? , set price=?, set type=? , set quantity=? where id=?";
			PreparedStatement ps = con.prepareStatement(updateQry);
				ps.setInt(1,ip.getItemID());
				ps.setString(2, ip.getItemName());
				ps.setInt(3,ip.getItemPrice());
				ps.setString(4,ip.getItemType());
				ps.setString(5,ip.getQuantity());
				ps.setInt(6, ItemDetails.updated_Id);
			  x=ps.executeUpdate();
			  System.out.println("Updation Method Invoked!!");
			  con.close();
		}
		catch(Exception e)
		{
			System.err.println("Method Failed :- "+e.getMessage());
		}
		return x;
	}
	
	@Override
	public int getItem(ItemPOJO ip) {
		int x=0;
		try 
		{
			Connection con = DBProps.getConnection();
			String selectQry = "select id,name,price,type, quantity from items where id=?";
			PreparedStatement ps = con.prepareStatement(selectQry);
				ps.setInt(1, ItemDetails.select_Id);
				 
			ResultSet rs = ps.executeQuery();
			System.out.println("ID \t Name \t Price \t\t Type \t\t Quantity");
			while(rs.next())
			{
				System.out.print(rs.getInt(1));
				System.out.print("\t"+rs.getString(2));
				System.out.print("\t"+rs.getInt(3));
				System.out.print("\t"+rs.getString(4));
				System.out.print("\t"+rs.getString(5));
			}
			System.out.println();
			con.close();

		} 
		catch (Exception e) 
		{
			System.err.println("Selection Method Failed"+e.getMessage());
		}
		return 1;
	
	}
	
	@Override 
	public void selectAllItems()
	{
		try 
		{
			Connection con = DBProps.getConnection();
			String selectAllQry = "select * from items";
			PreparedStatement ps = con.prepareStatement(selectAllQry );
			ResultSet rs = ps.executeQuery();
			System.out.println("ID\t\tName\t\tPrice\t\tType\t\tQuantity");
			while(rs.next())
			{
				System.out.print(rs.getInt(1));
				System.out.print("\t\t"+rs.getString(2));
				System.out.print("\t\t"+rs.getInt(3));
				System.out.print("\t\t"+rs.getString(4));
				System.out.print("\t\t"+rs.getString(5));
				System.out.println();
			}
			
			con.close();

		} 
		catch (Exception e) 
		{
			System.err.println("Selection Method Failed"+e.getMessage());
		}
	}
}
