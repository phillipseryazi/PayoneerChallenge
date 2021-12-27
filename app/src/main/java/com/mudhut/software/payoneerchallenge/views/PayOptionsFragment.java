package com.mudhut.software.payoneerchallenge.views;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mudhut.software.payoneerchallenge.R;
import com.mudhut.software.payoneerchallenge.adapters.PayOptionsRecyclerAdapter;
import com.mudhut.software.payoneerchallenge.viewmodels.MainViewModel;

public class PayOptionsFragment extends Fragment {
    private MainViewModel viewModel;
    private RecyclerView recyclerView;
    private PayOptionsRecyclerAdapter adapter;

    public PayOptionsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pay_options, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Toolbar toolbar = view.findViewById(R.id.payment_options_toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        toolbar.setNavigationOnClickListener(nav -> {
            Navigation.findNavController(view).popBackStack();
        });

        registerObservers(view);
        recyclerView = view.findViewById(R.id.payment_options_recyclerview);
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getPaymentMethods();
    }

    private void registerObservers(View view) {
        viewModel.livedataList.observe(getViewLifecycleOwner(), paymentMethods -> {
            adapter = new PayOptionsRecyclerAdapter(paymentMethods);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        });

        viewModel.showLoader.observe(getViewLifecycleOwner(), showLoader -> {
            if (showLoader) {
                view.findViewById(R.id.payment_options_progressbar).setVisibility(View.VISIBLE);
            } else {
                view.findViewById(R.id.payment_options_progressbar).setVisibility(View.GONE);
            }
        });
    }
}
