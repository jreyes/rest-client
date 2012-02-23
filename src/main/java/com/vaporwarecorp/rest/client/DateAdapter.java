package com.vaporwarecorp.rest.client;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateAdapter
    extends XmlAdapter<String, Date>
{
// ------------------------------ FIELDS ------------------------------

    private SimpleDateFormat dateFormat = new SimpleDateFormat( "EEE, dd MMM yyyy HH:mm:ss ZZZZZ", Locale.ENGLISH );

// -------------------------- OTHER METHODS --------------------------

    @Override
    public String marshal( Date date )
        throws Exception
    {
        return dateFormat.format( date );
    }

    @Override
    public Date unmarshal( String date )
        throws Exception
    {
        return dateFormat.parse( date );
    }
}
