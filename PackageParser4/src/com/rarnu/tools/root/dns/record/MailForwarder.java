package com.rarnu.tools.root.dns.record;

import java.io.IOException;

import com.rarnu.tools.root.dns.DNSInputStream;
import com.rarnu.tools.root.dns.DNSRR;

public class MailForwarder extends DNSRR {
	private String mailForwarder;

	protected void decode(DNSInputStream dnsIn) throws IOException {
		mailForwarder = dnsIn.readDomainName();
	}

	public String getMailForwarder() {
		return mailForwarder;
	}

	public String toString() {
		return getRRName() + "\tmail forwarder = " + mailForwarder;
	}
}
