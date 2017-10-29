package videoshop.order;

import static org.salespointframework.core.Currencies.EURO;

import javax.money.MonetaryAmount;

import org.javamoney.moneta.Money;
import org.salespointframework.catalog.Product;

/**
 * dauerhaft im Warenkorb enthalten, simuliert Versandkosten
 * @author verri
 *
 */
public class ShippingCosts extends Product {
	
	public ShippingCosts() {
		super("Versandkosten", Money.of(4.00, EURO));
	}

}
