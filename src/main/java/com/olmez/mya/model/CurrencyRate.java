package com.olmez.mya.model;

import java.time.LocalDate;
import java.util.Objects;

import org.springframework.lang.Nullable;

import com.olmez.mya.model.enums.CurrencyCode;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CurrencyRate extends BaseObject {

    private LocalDate date;
    private double amount = 1.0;
    private CurrencyCode baseCode = CurrencyCode.USD;
    private @Nullable Double cad;
    private @Nullable Double eur;
    private @Nullable Double gbp;
    private @Nullable Double jpy;
    private @Nullable Double tryy;
    private @Nullable Double usd;

    public CurrencyRate(LocalDate date, @Nullable Double cad, @Nullable Double eur, @Nullable Double gbp,
            @Nullable Double jpy, @Nullable Double tryy, @Nullable Double usd) {
        this.date = date;
        this.cad = cad;
        this.eur = eur;
        this.gbp = gbp;
        this.jpy = jpy;
        this.tryy = tryy;
        this.usd = usd;
    }

    @Override
    public String toString() {
        return "Currency rates on " + this.date;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CurrencyRate)) {
            return false;
        }
        CurrencyRate other = (CurrencyRate) obj;
        return (other.date.equals(date));
    }

    @Override
    public int hashCode() {
        return Objects.hash(date);
    }
}