package com.esrx.audit.audit;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("sai");
    }
}
