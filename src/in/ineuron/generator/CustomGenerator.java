package in.ineuron.generator;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor arg0, Object arg1) throws HibernateException {
		System.out.println("CustomGenerator");
		String date = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
		int id = new Random().nextInt(1000);

		return "Emp-" + id + "-" + date;

	}

}
