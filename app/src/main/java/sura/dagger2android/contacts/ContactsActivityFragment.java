package sura.dagger2android.contacts;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import sura.dagger2android.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class ContactsActivityFragment extends Fragment {

    public ContactsActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_contacts, container, false);
    }
}
