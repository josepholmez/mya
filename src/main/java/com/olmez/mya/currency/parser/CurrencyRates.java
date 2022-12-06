package com.olmez.mya.currency.parser;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.olmez.mya.model.enums.CurrencyCode;

import lombok.Getter;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@Getter
public class CurrencyRates {

    @JsonProperty("EUR")
    private EUR eUR;
    @JsonProperty("GBP")
    private GBP gBP;
    @JsonProperty("USD")
    private USD uSD;
    @JsonProperty("JPY")
    private JPY jPY;
    @JsonProperty("CAD")
    private CAD cAD;
    @JsonProperty("CHF")
    private CHF cHF;
    @JsonProperty("AUD")
    private AUD aUD;
    @JsonProperty("RUB")
    private RUB rUB;
    @JsonProperty("TRY")
    private TRY tRY;

    public class CAD extends CurrencyDetail {
        public CAD() {
            super(CurrencyCode.CAD);
        }
    }

    public class EUR extends CurrencyDetail {
        public EUR() {
            super(CurrencyCode.EUR);
        }
    }

    public class TRY extends CurrencyDetail {
        public TRY() {
            super(CurrencyCode.TRY);
        }
    }

    public class RUB extends CurrencyDetail {
        public RUB() {
            super(CurrencyCode.RUB);
        }
    }

    public class GBP extends CurrencyDetail {
        public GBP() {
            super(CurrencyCode.GBP);
        }
    }

    public class USD extends CurrencyDetail {
        public USD() {
            super(CurrencyCode.USD);
        }
    }

    public class AUD extends CurrencyDetail {
        public AUD() {
            super(CurrencyCode.AUD);
        }
    }

    public class CHF extends CurrencyDetail {
        public CHF() {
            super(CurrencyCode.CHF);
        }
    }

    public class JPY extends CurrencyDetail {
        public JPY() {
            super(CurrencyCode.JPY);
        }
    }

}
