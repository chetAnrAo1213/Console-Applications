package com.Hibernate_Annotated.App;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerDAO implements DmlMethods {

	@Override
	public void insertCustomer(CustomerPOJO cpj) {

		try 
		{
			SessionFactory sf = Hibernate_Props.getSessionFactory();
			Session ss = sf.openSession();
			Transaction trx = ss.beginTransaction();
			  cpj.setCustId(cpj.getCustId());
			  cpj.setCustName(cpj.getCustName());
			  cpj.setCustPhone(cpj.getCustPhone());
			  cpj.setCustEmail(cpj.getCustEmail());
			  cpj.setCustGender(cpj.getCustGender());
			ss.save(cpj);
			trx.commit();
			ss.close();
			
			System.out.println("-> SuccesFully Inserted!!");
			
		} 
		catch (Exception e) 
		{
		   System.out.println("INSERTION METHOD FAILED "+e);	
		 
		}
		
	}

	@Override
	public void updateCustomer(CustomerPOJO cpj) 
	{
		
		try 
		{
			SessionFactory sf = Hibernate_Props.getSessionFactory();
			Session ss = sf.openSession();
			Transaction trx = ss.beginTransaction();
			String updateQry = "update CustomerPOJO set custId=:a,"
			  										+" custName=:b,"
			  										+ "custPhone=:c,"
			  										+ "custEmail=:d,"
			  										+ "custGender=:e "
			  										+ " where custId=:x";
			
			Query qry = ss.createQuery(updateQry);
			  qry.setParameter("x", CustomerDetails.c_upid);
			  qry.setParameter("a", cpj.getCustId());
			  qry.setParameter("b", cpj.getCustName());
			  qry.setParameter("c", cpj.getCustPhone());
			  qry.setParameter("d", cpj.getCustEmail());
			  qry.setParameter("e", cpj.getCustGender());
			  
			  int x=qry.executeUpdate();
			  trx.commit();
			 ss.close();
			
			 
		}
		catch (Exception e) 
		{
			 System.out.println("Updation METHOD FAILED "+e.getMessage());
		}
		
		
	}

	@Override
	public void deleteCustomer(CustomerPOJO cpj) 
	{
		try 
		{
		     SessionFactory sf = Hibernate_Props.getSessionFactory();
		     Session ss = sf.openSession();
		     Transaction trx = ss.beginTransaction();
		     
		     String dq = "delete from CustomerPOJO where custId=:x";
		     Query qry = ss.createQuery(dq);
		     
		      qry.setParameter("x", cpj.getCustId());
		      qry.executeUpdate();
		     trx.commit();
		     ss.close();
		   
		} 
		catch (Exception e) 
		{
			 System.out.println("DELETION METHOD FAILED "+e.getMessage());
		}
	}

	@Override
	public void getCustomer(CustomerPOJO cpj) 
	{
		try 
		{
		     SessionFactory sf = Hibernate_Props.getSessionFactory();
		     Session ss = sf.openSession();
		       
		     String dq = "from CustomerPOJO where custId=:x";
		     Query qry = ss.createQuery(dq);
		     
		      qry.setParameter("x", cpj.getCustId());
		      List<CustomerPOJO> li = qry.getResultList();
		      System.out.println("Details Fetched !!!");
		      for(CustomerPOJO i:li)
		      {
		    	  System.out.println("ID :- "+i.getCustId());
		    	  System.out.println("Name :- "+i.getCustName());
		    	  System.out.println("Phone :- "+i.getCustPhone());
		    	  System.out.println("Mail :- "+i.getCustEmail());
		    	  System.out.println("Gender :- "+i.getCustGender());
		      }
		    
		     ss.close();
		     
		} 
		catch (Exception e) 
		{
			 System.out.println("Selection METHOD FAILED "+e.getMessage());
		}
	}

	
	@Override
	public void selectAllCustomers() 
	{
		try 
		{
		     SessionFactory sf = Hibernate_Props.getSessionFactory();
		     Session ss = sf.openSession();
		       
		     String dq = "from CustomerPOJO";
		     Query qry = ss.createQuery(dq);

		      List<CustomerPOJO> li = qry.getResultList();
		      System.out.println("Details Fetched !!!");
		      
		      for(CustomerPOJO i:li)
		    	  System.out.println(i);
		      
		     ss.close();
		     
		} 
		catch (Exception e) 
		{
			 System.out.println("Selection METHOD FAILED "+e.getMessage());
		}
	}
	
}
