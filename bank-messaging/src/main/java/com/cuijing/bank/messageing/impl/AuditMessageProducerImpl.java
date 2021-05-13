package com.cuijing.bank.messageing.impl;


import com.cuijing.bank.domain.types.AuditMessage;
import com.cuijing.bank.messaging.AuditMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
/**
 * @author CuiJIng
 * @date 2021-5-13 13:58
 */
@Component
public class AuditMessageProducerImpl implements AuditMessageProducer {
    private static final String TOPIC_AUDIT_LOG = "TOPIC_AUDIT_LOG";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public boolean send(AuditMessage message) {
        String messageBody = message.serialize();
        kafkaTemplate.send(TOPIC_AUDIT_LOG, messageBody);
        return true;
    }
}