package br.com.myskout.bottomnavigationbar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterInsta extends RecyclerView.Adapter<AdapterInsta.ViewHolder> {

    private Context context;

    private List<Insta> lstInsta;

    public AdapterInsta(Context context, List<Insta> lstInsta) {
        this.context = context;
        this.lstInsta = lstInsta;
    }

    public AdapterInsta(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterInsta.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(myContext).inflate(R.layout.modelo_insta, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterInsta.ViewHolder holder, int position) {
        Insta filme = lstInsta.get(position);
        holder.imgInsta.setImageResource(.getImage());
        holder.cardInsta.setOnClickListener(view -> Toast.makeText(myContext, "Video", Toast.LENGTH_SHORT).show());
    }

    @Override
    public int getItemCount() {
        return lstInsta.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgInsta;
        CardView cardInsta;



        public ViewHolder(View itemView) {
            super(itemView);
            imgInsta = itemView.findViewById(R.id.id_imgInsta);
            cardInsta = itemView.findViewById(R.id.id_CardView);
        }
    }
}
