package com.yanimetaxas.doubleentry.dao;

import com.yanimetaxas.doubleentry.Transaction;
import java.util.List;
import java.util.Set;

/**
 * @author yanimetaxas
 * @since 14-Nov-14
 */
public interface TransactionDao {

  void storeTransaction(Transaction transaction);

  Set<String> getTransactionRefsForAccount(String accountRef);

  List<Transaction> getTransactions(List<String> transactionRefs);

  Transaction getTransactionByRef(String transactionRef);

  void truncateTables();

  void setClientRef(String clientRef);

  String getClientRef();
}
