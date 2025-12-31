package com.haidev.loan.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {

    /**
     AuditorAware là interface của Spring Data Jpa Auditing
     là cầu nối giữa Spring Security và JPA Auditing
     nó lấy thông tin người dùng hiện tại trong Spring Context
     và cung cấp cho JPA để ghi vào các trường createdBy và updatedBy
     */
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("ACCOUNTS_MS");
    }
}