/**  
 * Project Name:spring-boot-jsp  
 * File Name:HelloController.java  
 * Package Name:com.kenson  
 * Date:Apr 17, 20184:09:33 PM  
 * Copyright (c) 2018, wc-08-03@hotmail.com All Rights Reserved.  
 *  
*/  
  
package com.kenson;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**  
 * ClassName:HelloController   
 * Function: TODO ADD FUNCTION.   
 * Reason:   TODO ADD REASON.   
 * Date:     Apr 17, 2018 4:09:33 PM   
 * @author   CHUNWU  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */
@Controller
public class HelloController {
	
	@RequestMapping("/index")
	public String inde() {
		return "index";
	}
}
  
