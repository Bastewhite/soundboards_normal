package es.baste.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import es.baste.R;
import es.baste.Sonido;
import es.baste.views.SoundItemController;

/**
 * MyRecyclerViewAdapter
 * soundboards_normal
 * <p/>
 * Created by Francisco Aguilar on 10/06/2015.
 * Copyright (c) 2015 Axa Group Solutions. All rights reserved.
 */
public class MyRecyclerViewAdapter extends RecyclerView.Adapter<SoundItemController> {

    private int mBackground;
    private List<Sonido> mSonidos;

    public MyRecyclerViewAdapter(Context context, List<Sonido> sonidos) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        mBackground = typedValue.resourceId;
        this.mSonidos = sonidos;
    }

    @Override
    public SoundItemController onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(
                SoundItemController.getLayoutResource(), viewGroup, false);
        view.setBackgroundResource(mBackground);
        return new SoundItemController(view);
    }

    @Override
    public void onBindViewHolder(SoundItemController sonidoItemController, int i) {
        sonidoItemController.configure(mSonidos.get(i));
    }

    @Override
    public int getItemCount() {
        return mSonidos.size();
    }
}
