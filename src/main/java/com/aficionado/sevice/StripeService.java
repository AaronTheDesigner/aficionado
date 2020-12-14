package com.aficionado.sevice;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import com.aficionado.models.ChargeRequest;
import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;

import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.Charge;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

@Service
public class StripeService {

   private static final String secretKey = "sk_test_51Hy6yGIvrquu0viBTxT6adHpFWoPnE51EeWwHRzFUBK92H0a5ZCPkDtLp3CCoPAbfC70qRXbKA9BgUnuapF2GOAj00k0jFxSz5";

   @PostConstruct
   public void init() {
       Stripe.apiKey = secretKey;
   }
   public Charge charge(ChargeRequest chargeRequest)
     throws AuthenticationException, InvalidRequestException,
       APIConnectionException, CardException, APIException, com.stripe.exception.AuthenticationException {
       Map<String, Object> chargeParams = new HashMap<>();
       chargeParams.put("amount", chargeRequest.getAmount());
       chargeParams.put("currency", chargeRequest.getCurrency());
       chargeParams.put("description", chargeRequest.getDescription());
       chargeParams.put("source", chargeRequest.getStripeToken());
       return Charge.create(chargeParams);
   }
}
