package com.apress.messaging.listener;

import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

import com.apress.messaging.annotation.Log;
import com.apress.messaging.event.CurrencyEvent;

@Component
public class RateEventListener {

	@TransactionalEventListener
	@Log(printParamsValues=true,callMethodWithNoParamsToString="getRate")
	public void processEvent(CurrencyEvent event){ }

	@TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
	@Log(printParamsValues=true,callMethodWithNoParamsToString="getRate")
	public void processEvent2(CurrencyEvent event){ }
}
