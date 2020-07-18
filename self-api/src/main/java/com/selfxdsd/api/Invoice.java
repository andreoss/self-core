package com.selfxdsd.api;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Represents all the completed tasks by a contributor in a contract.
 * An invoice is active until payment is done.
 * A contract has at most one active invoice.
 * @author criske
 * @version $Id$
 * @since 0.0.3
 */
public interface Invoice {

    /**
     * The id of the invoice.
     * @return Integer
     */
    int invoiceId();

    /**
     * The contract.
     * @return Contract
     */
    Contract contract();

    /**
     * Returns the Invoice's creation time.
     * @return LocalDateTime, never null.
     */
    LocalDateTime createdAt();

    /**
     * Tasked invoiced here.
     * @return InvoicedTasks.
     */
    InvoicedTasks tasks();

    /**
     * Total amount of the invoice. Calculated based on contract hourlyRate
     * and time spent to finish a task.
     * @return BigDecimal.
     */
    BigDecimal totalAmount();

    /**
     * An invoice is active until payment is done.
     * @return Boolean
     */
    boolean isPaid();
}
