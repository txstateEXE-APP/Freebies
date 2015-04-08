package exe.txstate.recycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Michael on 3/24/2015.
 */
public class eventAdapter extends RecyclerView.Adapter<eventAdapter.EventViewHelper>{

    private List<String> data= Collections.emptyList();
    private Context context ;
    private LayoutInflater layoutInflater ;

    public eventAdapter(List<String> data, Context context) {
        this.data = data;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context) ;

    }

    @Override
    public EventViewHelper onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=layoutInflater.inflate(R.layout.recycler_view_item,parent,false);
                return new EventViewHelper(v);
    }

    @Override
    public void onBindViewHolder(EventViewHelper holder, int position) {
        String currentEvent=data.get(position);
        holder.txtEvent.setText(currentEvent);
    }

    @Override
    public int getItemCount() {
        return data.size();

    }

    public class EventViewHelper extends RecyclerView.ViewHolder{
        private TextView txtEvent;
        public EventViewHelper(View itemView) {
            super(itemView);
            txtEvent=(TextView) itemView.findViewById(R.id.txtEvent);

        }
    }
}
