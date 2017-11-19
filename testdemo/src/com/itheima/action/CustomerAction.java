package com.itheima.action;

import com.itheima.domain.Customer;
import com.itheima.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Scope("prototype")
@Controller("customerAction")
public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{

    private Customer customer;

	@Autowired
    private CustomerService custmerService;

	public String save(){
        try {
            custmerService.save(customer);
        } catch (Exception e) {
            e.printStackTrace();
            ServletActionContext.getRequest().setAttribute("msg", "登陆失败");
            return ERROR;
        }
//        ServletActionContext.getRequest().getSession().setAttribute("user", user);
        return SUCCESS;
    }

    @Override
    public Customer getModel() {
        if (customer == null) {
            customer = new Customer();
        }
        return customer;
    }
}
