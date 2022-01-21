package com.innova.homework2.enumqualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "multipleQualifier")
@ApplicationScoped

public class QualifierManager {
	// default olarak çağırmak için alttaki 2 satırı açabilir ve default olan
	// MariaDb yi çağırabiliriz
	// @Inject
	// MyDatabaseVersion myDatabaseVersion;
	
	// opsiyonel olarak database imizi çağırmak için ise alttaki 2 satır kodu
	// kullanıyoruz.
	// Biz burda opsiyonel olarak MYSQL i çağırdık.
	@Inject
	@EQualifier(EDatabaseVersion.MYSQL)
	MyDatabaseVersion myDatabaseVersion;
	
	public String getiJavaVersion() {
		return myDatabaseVersion.databaseVersion("Seçim");
		
	}
	
}
