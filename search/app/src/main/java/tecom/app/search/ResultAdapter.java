package tecom.app.search;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ResultAdapter extends RecyclerView.Adapter<ResultAdapter.ViewHolder> {
    private ArrayList<Result> mDate=null;

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView title,link,description,postdate;
        ViewHolder(View item){
            super(item);
            title=(TextView) item.findViewById(R.id.title);
            link=(TextView) item.findViewById(R.id.link);
            description=(TextView) item.findViewById(R.id.description);
            postdate=(TextView) item.findViewById(R.id.postdate);
        }
    }
    ResultAdapter(ArrayList<Result> list){
        mDate=list;
    }

    @NonNull
    @Override
    public ResultAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;

        View view = inflater.inflate(R.layout.items, parent, false) ;
        ResultAdapter.ViewHolder vh = new ResultAdapter.ViewHolder(view) ;

        return vh ;    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(Html.fromHtml(mDate.get(position).getTitle()));
        holder.link.setText(Html.fromHtml(mDate.get(position).getLink()));
        holder.description.setText(Html.fromHtml(mDate.get(position).getDescription()));
        holder.postdate.setText(Html.fromHtml(mDate.get(position).getPostdate()));
    }

    @Override
    public int getItemCount() {
        return mDate.size();
    }
}
