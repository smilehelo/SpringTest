package me.springtest.security;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		System.out.println("My User Detail Service!");
		
		if(!username.equals("user")){
			throw new UsernameNotFoundException("用户名错误！");
		}
		
		boolean enabled = true;                	 //可用性 	   :true:可用       false:不可用
        boolean accountNonExpired = true;        //过期性        :true:没过期    false:过期
        boolean credentialsNonExpired = true;    //有效性        :true:凭证有效 false:凭证无效
        boolean accountNonLocked = true;  		 //锁定性	   :true:未锁定    false:已锁定	

		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		return new org.springframework.security.core.userdetails.User(
				username,
				//user.getUserPassword()+"{"+user.getUserName()+"}", 
				"123", 
				enabled, 
				accountNonExpired, 
				credentialsNonExpired, 
				accountNonLocked, 
				authorities);
	}

}
