package md.tx.materialdesigndemo.complexCoordinatorLayout;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import md.tx.materialdesigndemo.R;

/**
 * Created by Taxi on 2017/3/30.
 */

public class FakePageAdapter extends RecyclerView.Adapter<FakePageVH> {

    private int numItems;

    public FakePageAdapter(int numItems) {
        this.numItems = numItems;
    }

    @Override
    public FakePageVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_card, parent, false);

        return new FakePageVH(itemView);
    }

    @Override
    public void onBindViewHolder(FakePageVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return numItems;
    }
}

class FakePageVH extends RecyclerView.ViewHolder {

    public FakePageVH(View itemView) {
        super(itemView);
    }
}

