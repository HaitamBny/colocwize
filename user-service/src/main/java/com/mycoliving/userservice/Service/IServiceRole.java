package com.mycoliving.userservice.Service;

import com.mycoliving.userservice.Domain.Entity.Role;

import java.util.List;

public interface IServiceRole {
    Role createRole(Role role);
    Role getRoleById(Long id);
    List<Role> getAllRoles();
    Role updateRole(Role role);
    void deleteRole(Long id);
}
