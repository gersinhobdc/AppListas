package br.com.myskout.bottomnavigationbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterInsta extends RecyclerView.Adapter<AdapterInsta.ViewHolder> {

    private Context context;

    private List<Insta> lstInsta;
    private int imgInsta;

    public AdapterInsta(Context context, List<Insta> lstInsta) {
        this.context = context;
        this.lstInsta = lstInsta;
    }

    public AdapterInsta(Context context) {
        this.context = context;
    }

    public AdapterInsta(String[] myDataset) {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.modelo_insta, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Insta insta = lstInsta.get(position);
        holder.imgInsta.setImageResource(this.getImage());
        holder.cardInsta.setOnClickListener(view -> Toast.makeText(context, "Video", Toast.LENGTH_SHORT).show());
    }

    @Override
    public int getItemCount() {
        return lstInsta.size();
    }

    public int getImage() {
        return imgInsta;
    }

    public void setImage(int image) {
        this.imgInsta = image;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgInsta;
        CardView cardInsta;


        public ImageView getImgInsta() {
            return imgInsta;
        }

        public void setImgInsta(ImageView imgInsta) {
            this.imgInsta = imgInsta;
        }

        @SuppressLint("WrongViewCast")
        public ViewHolder(View itemView) {
            super(itemView);
            imgInsta = itemView.findViewById(R.id.imgInsta);
            cardInsta = itemView.findViewById(R.id.cardInsta);
        }
    }
}
